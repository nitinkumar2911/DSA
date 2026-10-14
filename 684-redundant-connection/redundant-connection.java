class DSU{
    int parent[];
    int rank[];
    DSU(int n){
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i<n; i++){
            parent[i] = i;
        }
    }
    public  int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    public  boolean union(int a , int b){
        int rootA = find(a);
        int rootB = find(b);
        if(rootA == rootB){
            return false;
        }
        if(rank[rootA] > rank[rootB]){
            parent[rootB] = rootA;
        }else if(rank[rootA] < rank[rootB]){
            parent[rootA] =rootB;
        }else{
            parent[rootA] = rootB;
            rank[rootB]++;
           
        }
         return true;
    }
}

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        DSU dsu = new DSU(n+1);
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            if(!dsu.union(u,v)){
                return edge;
            }
        }
        return new int[0];

    }
}