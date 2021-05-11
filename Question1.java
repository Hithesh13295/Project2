import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.io.FileWriter;

public class Question1
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("E:\\TY Basics\\Exercises\\file_diff.txt");
		Scanner sc = new Scanner(f1);
		char c1[]=new char[10];
		for(int i=0;i<10;i++)
		{
			String c = sc.next();
			c1[i]=c.charAt(0);
		}
		for(int j=0;j<10;j+=2)
		{
			if(c1[j]=='M' || c1[j]=='A')
			{
				File sf1 = new File("E:\\TY Basics\\Exercises\\src\\objects\\Event.object.txt");
				File df1 = new File("E:\\TY Basics\\Exercises\\deployPackage\\added\\Event.object.txt");
				Files.copy(sf1.toPath(), df1.toPath(), StandardCopyOption.REPLACE_EXISTING);
				FileWriter w1 = new FileWriter("E:\\TY Basics\\Exercises\\added.txt");
				PrintWriter pw1 = new PrintWriter(w1);
				pw1.println("Event.object");
				File sf2 = new File("E:\\TY Basics\\Exercises\\src\\objects\\Trading_Event__c.object.txt");
				File df2 = new File("E:\\TY Basics\\Exercises\\deployPackage\\added\\Trading_Event__c.object.txt");
				Files.copy(sf2.toPath(), df2.toPath(), StandardCopyOption.REPLACE_EXISTING);
				pw1.println("Trading_Event__c.object");
				File sf3 = new File("E:\\TY Basics\\Exercises\\src\\profiles\\Admin.profile.txt");
				File df3 = new File("E:\\TY Basics\\Exercises\\deployPackage\\added\\Admin.profile.txt");
				Files.copy(sf3.toPath(), df3.toPath(), StandardCopyOption.REPLACE_EXISTING);
				pw1.println("Admin.profile");
				pw1.close();
				w1.close();
			}
			else if(c1[j]=='R' || c1[j]=='D')
			{
				File sf1 = new File("E:\\TY Basics\\Exercises\\src\\objects\\ActiveScratchOrg.object.txt");
				File df1 = new File("E:\\TY Basics\\Exercises\\deployPackage\\removed\\ActiveScratchOrg.object.txt");
				Files.copy(sf1.toPath(), df1.toPath(), StandardCopyOption.REPLACE_EXISTING);
				FileWriter w1 = new FileWriter("E:\\TY Basics\\Exercises\\removed.txt");
				PrintWriter pw1 = new PrintWriter(w1);
				pw1.println("ActiveScratchOrg.object");
				File sf2 = new File("E:\\TY Basics\\Exercises\\src\\reports\\CACI_Imports\\All_Closed.report.txt");
				File df2 = new File("E:\\TY Basics\\Exercises\\deployPackage\\removed\\All_Closed.report.txt");
				Files.copy(sf2.toPath(), df2.toPath(), StandardCopyOption.REPLACE_EXISTING);
				pw1.println("All_Closed.report");
				pw1.close();
				w1.close();
			}
		}
	}
}