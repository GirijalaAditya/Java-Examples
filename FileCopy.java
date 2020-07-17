import java.io.*; 
class FileCopy
{
	public static void main(String args[])throws IOException
	{
		File in=new File("Input.txt");
		File out=new File("Output.txt");
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr=new FileReader(in);
			fw=new FileWriter(out);	
			int c;
			while((c=fr.read())!=-1)
			{
				fw.write(c);
			}
		}
		finally
		{
			if(fr!=null)
			{
				fr.close();
			}
			if(fw!=null)
			{
				fw.close();	
			}
		}
	}
}
