package org.tns.programs;

public class GFG {
		public static int palinArray(int[] a, int n)
	           {
	                    boolean flag = true;
	                    for(int i = 0; i <= n; i++){
	                      int temp = a[i];
	                      int sum = 0, r = 0;
	                      
	                      while(temp >= 0){
	                          r = temp%10;
	                          sum = (sum * 10) + r;
	                          temp = temp/10;
	                      }
	                      if(sum != a[i]){
	                          flag = false;
	                      }
	                  }
	                  if(flag == true){
	                      return 1;
	                  }
	                  else{
	                      return 0;
	                  }
	           }
	}
