import socket

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

host = '127.0.0.1'
port = 8080

server_socket.bind((host, port))

server_socket.listen(7)

print(f"Server is listening on {host}:{port}")

try:
    while True:
        print(f"\nWaiting for a client to connect...")

        client_socket, client_address = server_socket.accept()
        print(f"Connection established with {client_address}")

        message = f"Hello from server!"
        client_socket.send(message.encode('utf-8'))

        client_socket.close()
        print(f"Connection closed!")
except KeyboardInterrupt:
    server_socket.close()
    print(f"\nServer shutting down!")
