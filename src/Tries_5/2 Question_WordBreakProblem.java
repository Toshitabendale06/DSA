package Tries_5;

class Question_WordBreakProblem {
    static class Node{
        Node[] children;
        boolean eow; //end of word

        public Node(){
            children = new Node[26]; //a to z
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    //insert
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            //exist nhi hai   --> create new node
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if(i == word.length() - 1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    //search
    public static boolean search(String key){
        Node curr= root;
        for(int i=0; i<key.length(); i++){   //O(l)  --> l=length of key
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }
            if(i == key.length() - 1 && node.eow == false){
                return false;
            }
            curr = node;
        }
        return true;
    }
    //word Break problem
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secPart = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}
