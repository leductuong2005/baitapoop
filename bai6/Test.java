package bai6;

import java.util.Scanner;

public class Test {
	    public static void main(String[] args) {
	    	System.out.println("nhap so nhan vien: ");
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	        PartTimeEmployee p[]=new PartTimeEmployee[n];
	        for (int i=0;i<n;i++)
	        {
	        	p[i]=new PartTimeEmployee();
	        	p[i].nhapThongTin();
	        	System.out.println(p[i].toString());
	         
	        }
	        for (int i=0;i<n;i++)
	        for(int j=i+1;j<n;j++ )
	        {
	        	if (p[i].luong<p[j].luong)
	        	{
	        		PartTimeEmployee tg=p[i];
	        		p[i]=p[j];
	        		p[j]=tg;
	        	}
	        }
	        for (int i=0;i<n;i++)
	        System.out.println(p[i].toString());
	        sc.close();
	    }
}
