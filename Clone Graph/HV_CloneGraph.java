public class HV_CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null)
            return null;
        HashMap<Integer,UndirectedGraphNode> map=new HashMap<>();
        Queue<UndirectedGraphNode> queue=new LinkedList<>();
        queue.add(node);
        UndirectedGraphNode copyNode=new UndirectedGraphNode(node.label);
        map.put(node.label,copyNode);
        Set<UndirectedGraphNode> visited=new HashSet<>();
        visited.add(node);
        while(!queue.isEmpty()){
            UndirectedGraphNode u=queue.poll();
            UndirectedGraphNode currNode=map.get(u.label);
            for(UndirectedGraphNode v : u.neighbors){
                if(!map.containsKey(v.label)){
                    UndirectedGraphNode newNode=new UndirectedGraphNode(v.label);
                    map.put(v.label,newNode);
                }
                currNode.neighbors.add(map.get(v.label));
                if(!visited.contains(v)){
                    visited.add(v);
                    queue.add(v);
                }
            }
        }
        return copyNode;
    }
}