package nayoung;


public class Solution {

	public static void main(String[] args){
        Solution sol = new Solution();
        int[] money = {1, 2, 3, 1};
        int result = sol.solution(money);
        System.out.println(result);
    }
    public int solution(int[] money) {
        int answer = 0;
        
        int n = money.length;
        boolean[] v = new boolean[n];
        mem = new int[n];
        dfs(0, 0, money, n, v, 0);
//        Arrays.sort(mem);
//        print();
//        answer = mem[n-1];
        answer = max;
        return answer;
    }
    
    public static int[] mem;
    
    // 0 1 2 3
    // 1 2 3 1
    // x x 
    //   o
    
    // 0
    
    // x x x x
    // x x o x
    // x x 
    
    public void print(){
    	for(int i = 0; i<mem.length; i++){
    		System.out.print(mem[i] + " ");
    	}
    	System.out.println();
    }
    public void print(boolean[] v ){
    	System.out.println("v!@!@ ");
    	for(int i = 0; i<v.length; i++){
    		System.out.print(v[i] + " ");
    	}
    	System.out.println();
    }
    
    public static int max = 0;
    public void dfs(int start, int step, int[] money, int n, boolean[] v, int sum){
        if(step >= n){
        	max = Math.max(max, sum);
            return;
        }
        
        if(v[step]){
            return;
        }
        
        v[step] = true;
        // start 방문 했을때
        dfs(start, step+2, money, n, v, sum+money[step]);
        
        v[step] = false;
        // start 방문 안했을때
        dfs(start, step+1, money, n, v,  sum);
        return;
    }

}
