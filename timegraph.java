package buffer;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;

public class timegraph {

static int z,T,E;

 
 public static void main(String[] args) throws IOException{
	
	 int a,b;
	  String tmp;
	    int[] r=new int [100];
	    int c;
	    int capmax=1000;
	   int ca=0; 
	   int NT[] =new int [100];
	   int nz[] = new int [100];
       int ns[]= new int [100];
       int[][] cap=new int[5000][5000];
	    String[] res=null;
		  int [][] array=new int[5000][5000];
		  String filename = "smallnet.txt" ;
		  String file_name = "time.txt" ;
		  String FILENAME1="lp5.lp";
		  //= in.readLine(); 
 int de=1;
 int com=10;
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 //System.out.print("Please enter the file name to read : ");
 
	  //System.out.print("Please enter the time taken by longest path to read : ");
	  //String T1 = in.readLine();
	  //System.out.print("Please enter the number of commodities to read : ");
	  //String com1 = in.readLine();
	  System.out.print("Please enter r to read : ");
	  String r1 = in.readLine();
	  T=15;
		  //Integer.parseInt(T1);
	 // com=1;
		  //Integer.parseInt(com1);
	 // Random randomGenerator = new Random();
	  for(int p=0;p<com;p++)
	  {
		  //System.out.print("Please enter "+ p +" r to read : ");
		  //String r1 = in.readLine();
		  r[p]=Integer.parseInt(r1);
		  
		//  System.out.print("Please enter the" + p + "source to read : ");
	    //String ns1 = in.readLine();
	    //ns[p]=Integer.parseInt(ns1);
	    
		  Random generator = new Random();
	    int rand=generator.nextInt();
	    ns[p]=(rand % 24) + 1;
	       //=randomGenerator.nextInt(24);
	   // System.out.print("Please enter the" + p + "sink to read : ");
	    //String nz1 = in.readLine();
	    //nz[p]=Integer.parseInt(nz1);10
	   //int f=23-ns[p];
	    nz[p]=(rand % 24) + 1;//=randomGenerator.nextInt(f)+ns[p];
	    //System.out.print("Please enter the" + p + "time to read : ");
	    //String NT1 = in.readLine();
	    //NT[p]=Integer.parseInt(NT1);
	    NT[p]=T;
	    	//randomGenerator.nextInt(T);
	  }
	    int numEdgeTG=0;
 
 //creating time graph from regular graph
 
     
	 
	  
    FileReader input1 = new FileReader(filename);
	  BufferedReader bufRead1 = new BufferedReader(input1);
	  
	  FileWriter outFile1 = new FileWriter(file_name);
	  PrintWriter out1 = new PrintWriter(outFile1);
	  tmp = bufRead1.readLine();
	  res = tmp.split("\\s");
	   a=Integer.parseInt(res[0]);
	   b=Integer.parseInt(res[1]);
	   int j=0;
	   while (tmp!= null)
		  {
			 
			  tmp = bufRead1.readLine();
			//  System.out.println(tmp);
			 if(tmp!=null)
			  {
				// System.out.println(tmp);
			     res = tmp.split("\\s");
			   a=Integer.parseInt(res[0]);
			   z=a*(T+1);
			   z=z-1;
			   b=Integer.parseInt(res[1]);
			   
			   c=Integer.parseInt(res[3]);
			   
			   for(int i=0;i<=T;i++)
			   {
				   int src = a*(T+1) + i;
				     int dst = b*(T+1) + i + (capmax/c);
				    // System.out.println(src);
				  //   System.out.println(dst);
				     if( (src < (a+1)*(T+1)) && (dst < (b+1)*(T+1)) )
				     {
				      out1.println(src+ "\t" + dst + "\t" + c );
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
	  
 }
}
	
	 