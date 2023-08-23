public class LengthOfStringRecursion {
    public static int LengthString(String str,int index,int count){
    	if(index == str.length()){
        	return count;
    	}
   	    return LengthString(str,++index,++count); 
	}
	public static void main(String[] args){
    	String str="nandana";
    	int index=0;
    	int count=0;
    	System.out.print(LengthString(str,index,count));
	}
}
