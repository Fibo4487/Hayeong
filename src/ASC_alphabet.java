public class ASC_alphabet {
    public static void main(String[] args) {

        int i;

        for (i = 0; i <= 255; ++i )
        {
            if( (i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))
            {
            System.out.println(i+":"+(char)i);
            }

        }

    }
}
