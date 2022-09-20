package com.Q3;

public class Main {
	public int[] findAndReturnPrimeNumbers(int[] arr){
	    int len=arr.length;
	    int x=0;
	    
	    int[] Prime=new int[len];
	    
	    for(int i=0; i<len; i++) {
	        
	        boolean flag=false;
	        int j=2;
	        
	        while(j<=Math.floor ( Math.sqrt( arr[i]) ) ) {
	            
	            if(arr[i]%j==0) {
	                flag=true;
	                break;
	            }
	            
	            j++;
	        }
	        
	        if(!flag) {				
	            Prime[x++]=arr[i];
	        }
	        
	    }
	    
	    return Prime;
	    
	}



	public static void main(String[] args) {
	    
	    Main m=new Main();
	    int[] arr = {10,12,5,50,11,14,15};
	    int[] Prime=m.findAndReturnPrimeNumbers(arr);
	    
	    if(Prime[0]==0) {
	        
	        System.out.println("Prime number not found in the supplied Array");
	        return;
	    }
	    
	    for(int i=0;i<Prime.length;i++) {
	        
	        if(Prime[i]==0) 
	            return;
	        
	        System.out.println(Prime[i]);
	    }
	}


}
