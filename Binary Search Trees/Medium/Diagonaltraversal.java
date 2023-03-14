class Tree
{
    
    Map<Integer, ArrayList<Integer>> hm;
     public ArrayList<Integer> diagonal(Node root)
      {
           
           hm=new TreeMap<>();
           ArrayList<Integer> ans= new ArrayList<>();
           verticalOrder(root,0);
           for(Map.Entry<Integer,ArrayList<Integer>> e : hm.entrySet())
           {
               for(int i: e.getValue())
               {
                   ans.add(i);
               }
           }
           return ans;
      }
      
      public  void verticalOrder(Node root, int hd)
      {
          if(root==null)
          {
              return;
          }
          ArrayList<Integer> ans= hm.get(hd);
          if(ans==null)
          {
              ans=new ArrayList<>();
              ans.add(root.data);
              
          }
          else
          {
              ans.add(root.data);
          }
          
          hm.put(hd,ans);
          verticalOrder(root.left, hd+1);
          verticalOrder(root.left, hd);
          
      }
}