// Kelas Graph
class Graph {
    constructor() {
        this.vertices = new Set();
        this.edges = [];
    }

    // Menambahkan simpul (vertex)
    addVertex(vertex) {
        this.vertices.add(vertex);
    }

    // Menambahkan sisi (edge) antara dua simpul
    addEdge(vertex1, vertex2) {
        if (this.vertices.has(vertex1) && this.vertices.has(vertex2)) {
            this.edges.push([vertex1, vertex2]);
        } else {
            console.log("Pastikan simpul sudah ditambahkan terlebih dahulu!");
        }
    }

    // Menampilkan graf
    displayGraph() {
        console.log("\nGraf:");
        console.log("Simpul:", Array.from(this.vertices));
        console.log("Sisi:", this.edges);
    }

    // Menampilkan subgraph (berdasarkan input subset simpul dan sisi)
    createSubgraph(subVertices, subEdges) {
        console.log("\nSubgraph:");
        console.log("Simpul Subgraph:", Array.from(subVertices));
        const validEdges = subEdges.filter(e => subVertices.has(e[0]) && subVertices.has(e[1]));
        console.log("Sisi Subgraph:", validEdges);
    }
}

// Program Utama
const graph = new Graph();

// Input jumlah simpul
const n = parseInt(prompt("Masukkan jumlah simpul: "));
console.log("Input nama simpul:");
for (let i = 0; i < n; i++) {
    const vertex = prompt("Simpul: ");
    graph.addVertex(vertex);
}

// Input jumlah sisi
const m = parseInt(prompt("\nMasukkan jumlah sisi: "));
console.log("Input sisi (format: simpul1 simpul2):");
for (let i = 0; i < m; i++) {
    const [v1, v2] = prompt("Sisi: ").split(' ');
    graph.addEdge(v1, v2);
}

// Menampilkan graf awal
graph.displayGraph();

// Input subgraph
console.log("\n--- Membuat Subgraph ---");
const subVertices = new Set(prompt("Masukkan simpul subgraph (pisahkan dengan spasi): ").split(' '));
const subEdges = [];
const k = parseInt(prompt("Masukkan jumlah sisi subgraph: "));
console.log("Input sisi subgraph (format: simpul1 simpul2):");
for (let i = 0; i < k; i++) {
    const [v1, v2] = prompt("Sisi: ").split(' ');
    subEdges.push([v1, v2]);
}

// Menampilkan subgraph
graph.createSubgraph(subVertices, subEdges);