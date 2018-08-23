class Paragraph
{    public static void main(String s[])
    {
        String paragraph = "Java's primary motivation was platform independence and not internet.\r\nPlatform independence means the ability to write a program on one platform and run\r\nit on any other platform without worrying about the platform specific features. If it works on one platform,\r\nit should work on all other platforms.";
        System.out.println("The Paragraph details are : " + getParagraphDetails(paragraph));

    }


public static ParagraphDetails getParagraphDetails(String paragraph) { 

} 
} 
class ParagraphDetails { 

int lines; 
int words; 

public ParagraphDetails(int lines, int words) { 
this.lines = lines; 
this.words = words; 
} 

@Override 
public String toString() { 
return "Lines = " + lines + ", " + "Words = " + words; 
} 
} 
