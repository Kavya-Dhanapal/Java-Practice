class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
    for(char c:s.toCharArray()){
       
        if(!stack.isEmpty() &&stack.peek()==c){
            stack.pop();
        }
        else{
             stack.push(c);
        }
    }
    String ans = "";
    while(!stack.empty()){
    ans+= stack.peek(); 
    stack.pop();
    }
    char a[]=ans.toCharArray();
    int st=0;
    int end=a.length-1;
    
    while(st<end){
        char temp=a[st];
        a[st]=a[end];
        a[end]=temp;
        st++;
        end--;
    }
    String s1=new String(a);
return s1;


   
    }
}