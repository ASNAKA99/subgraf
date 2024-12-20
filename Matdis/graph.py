# Program Input Graf dan Subgraph
class Graph:
    def __init__(self):
        self.vertices = set()
        self.edges = []

    # Menambahkan simpul (vertex)
    def add_vertex(self, vertex):
        self.vertices.add(vertex)

    # Menambahkan sisi (edge) antara dua simpul
    def add_edge(self, vertex1, vertex2):
        if vertex1 in self.vertices and vertex2 in self.vertices:
            self.edges.append((vertex1, vertex2))
        else:
            print("Pastikan simpul sudah ditambahkan terlebih dahulu!")

    # Menampilkan graf
    def display_graph(self):
        print("\nGraf:")
        print("Simpul:", self.vertices)
        print("Sisi:", self.edges)

    # Menampilkan subgraph (berdasarkan input subset simpul dan sisi)
    def create_subgraph(self, sub_vertices, sub_edges):
        print("\nSubgraph:")
        print("Simpul Subgraph:", sub_vertices)
        valid_edges = [e for e in sub_edges if e[0] in sub_vertices and e[1] in sub_vertices]
        print("Sisi Subgraph:", valid_edges)

# Program Utama
if __name__ == "__main__":
    graph = Graph()

    # Input jumlah simpul
    n = int(input("Masukkan jumlah simpul: "))
    print("Input nama simpul:")
    for _ in range(n):
        vertex = input("Simpul: ")
        graph.add_vertex(vertex)

    # Input jumlah sisi
    m = int(input("\nMasukkan jumlah sisi: "))
    print("Input sisi (format: simpul1 simpul2):")
    for _ in range(m):
        v1, v2 = input("Sisi: ").split()
        graph.add_edge(v1, v2)

    # Menampilkan graf awal
    graph.display_graph()

    # Input subgraph
    print("\n--- Membuat Subgraph ---")
    sub_vertices = set(input("Masukkan simpul subgraph (pisahkan dengan spasi): ").split())
    sub_edges = []
    k = int(input("Masukkan jumlah sisi subgraph: "))
    print("Input sisi subgraph (format: simpul1 simpul2):")
    for _ in range(k):
        v1, v2 = input("Sisi: ").split()
        sub_edges.append((v1, v2))

    # Menampilkan subgraph
    graph.create_subgraph(sub_vertices, sub_edges)
