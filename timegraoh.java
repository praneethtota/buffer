package buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class timegraoh {
	int a,b;
	  String tmp;
	    int r=10;
	    int c;
	    int capmax=16;
	   int ca=0; 
	    int[][] cap=new int[5000][5000];
	    String[] res=null;
	    String filename = "smallnet.txt" ;
		  String file_name = "time.txt" ;
	    FileReader input1 = new FileReader(filename);
		  BufferedReader bufRead1 = new BufferedReader(input1);
		  
		  FileWriter outFile1 = new FileWriter(file_name);
		  PrintWriter out1 = new PrintWriter(outFile1);
		  tmp = bufRead1.readLine();
		  res = tmp.split("\\s");
		   a=Integer.parseInt(res[0]);
		   b=Integer.parseInt(res[1]);
		   int j=0;
		   int T;
		   while (tmp!= null)
			  {
				 
				  tmp = bufRead1.readLine();
				 if(tmp!=null)
				  {
					// System.out.println(tmp);
				     res = tmp.split("\\s");
				   a=Integer.parseInt(res[0]);
				   int z = a*(T+1);
				   z=z-1;
				   b=Integer.parseInt(res[1]);
				   
				   c=Integer.parseInt(res[3]);
				   for(int i=0;i<=T;i++)
				   {
					   int src = a*(T+1) + i;
					     int dst = b*(T+1) + i + (capmax/c);
					     if( (src < (a+1)*(T+1)) && (dst < (b+1)*(T+1)) )
					     {
					      out1.println(src+ "\t" + dst + "\t" + c );
					      int numEdgeTG;
						numEdgeTG++;
					     }
				   }
				
				  }
			  }		  
			  j=0;
		   out1.close();
			  System.out.println("time graph created successfully.");
			//reading from time graph and creating adjacency matrix
			  
			  
			  FileReader input = new FileReader(file_name);
			  BufferedReader bufRead = new BufferedReader(input);
			  tmp = bufRead.readLine();
			  res = tmp.split("\\s");
			  int[][] array;
			  for(int i=0; i<=z; i++)
			    for( j=0; j<=z;j++)
			    	{
			    	cap[i][j]=0;
			    	
					array[i][j]=0;
			    	}
			 array[Integer.parseInt(res[0])][Integer.parseInt(res[1])]=1;
			  cap[Integer.parseInt(res[0])][Integer.parseInt(res[1])]=Integer.parseInt(res[2]);

			 while (tmp!= null)
			  {
				 
				  tmp = bufRead.readLine();
				 if(tmp!=null)
				  {
				//	 System.out.println(tmp);
				    
				  res = tmp.split("\\s");
				  array[Integer.parseInt(res[0])][Integer.parseInt(res[1])]=1;
				   cap[Integer.parseInt(res[0])][Integer.parseInt(res[1])]=Integer.parseInt(res[2]);
				   //System.out.println(cap[Integer.parseInt(res[0])][Integer.parseInt(res[1])]);
				  //  System.out.println(array[Integer.parseInt(res[0])][Integer.parseInt(res[1])]);
				  }
			  }		  
			  
		  
	
		 

