import socket
import json
import googlemaps

GOOGLE_API_KEY = ""
gmaps = googlemaps.Client(key=GOOGLE_API_KEY)

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

host = '127.0.0.1'
port = 8080

server_socket.bind((host, port))
server_socket.listen(7)

print(f"Server is listening on {host}:{port}")

def get_address_suggestions(input_text):
    try:
        result = gmaps.places_autocomplete(
            input_text=input_text,
            types='address',
            language='en'
        )
        
        suggestions = [place['description'] for place in result]
        return suggestions
    except Exception as e:
        print(f"Error getting suggestions: {e}")
        return []

try:
    while True:
        print(f"\nWaiting for a client to connect...")

        client_socket, client_address = server_socket.accept()
        print(f"Connection established with {client_address}")

        data = client_socket.recv(1024)
        user_input = data.decode('utf-8')
        print(f"Received search query: '{user_input}'")

        suggestions = get_address_suggestions(user_input)
        
        response = json.dumps(suggestions)
        client_socket.send(response.encode('utf-8'))
        
        print(f"Sent {len(suggestions)} suggestions")

        client_socket.close()
        print(f"Connection closed!")
        
except KeyboardInterrupt:
    server_socket.close()
    print(f"\nServer shutting down!")