import socket

client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

host = '127.0.0.1'
port = 8080

print(f"Connecting to server at {host}:{port}...")
client_socket.connect((host, port))
print("Connected!")

data = client_socket.recv(1024)
print(f"Received from server: {data.decode('utf-8')}")

client_socket.close()
print("Connection closed")
