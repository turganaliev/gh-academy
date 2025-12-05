import socket
import json

def get_address_suggestions(user_input):
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    
    host = '127.0.0.1'
    port = 8080
    
    try:
        print(f"Connecting to server at {host}:{port}...")
        client_socket.connect((host, port))
        print("Connected!")
        
        client_socket.send(user_input.encode('utf-8'))
        
        data = client_socket.recv(4096)
        suggestions = json.loads(data.decode('utf-8'))
        
        return suggestions
    finally:
        client_socket.close()

print("Address Autocomplete (type 'quit' to exit)")
print("-" * 50)

while True:
    user_input = input("\nEnter address (or 'quit'): ").strip()
    
    if user_input.lower() == 'quit':
        print("Goodbye!")
        break
    
    if len(user_input) < 2:
        print("Please enter at least 2 characters")
        continue
    
    suggestions = get_address_suggestions(user_input)
    
    if suggestions:
        print(f"\nFound {len(suggestions)} suggestions:")
        for i, address in enumerate(suggestions, 1):
            print(f"{i}. {address}")
    else:
        print("No suggestions found")