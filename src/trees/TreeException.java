package trees;

public class TreeException extends Exception
{
	public TreeException(String s)
	{
		super(s + " is not valid");
	}
}
