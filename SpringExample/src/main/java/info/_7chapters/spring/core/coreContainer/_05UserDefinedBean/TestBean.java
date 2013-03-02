package info._7chapters.spring.core.coreContainer._05UserDefinedBean;

public class  TestBean
{	
	private String message;

	public void setMessage(String msg)
	{
		this.message = msg;
	}

	public String toString()
	{
		return message;
	}
}