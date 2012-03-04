// $ANTLR 3.4 C:\\Users\\Unicamp-VM\\workspace\\test\\src\\pack\\grammarSample.g 2012-03-04 12:46:32

  package pack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class grammarSampleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "Whitespace"
    };

    public static final int EOF=-1;
    public static final int IDENT=4;
    public static final int Whitespace=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public grammarSampleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammarSampleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return grammarSampleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Unicamp-VM\\workspace\\test\\src\\pack\\grammarSample.g"; }



    // $ANTLR start "rule"
    // C:\\Users\\Unicamp-VM\\workspace\\test\\src\\pack\\grammarSample.g:13:1: rule : ( IDENT )+ ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\Unicamp-VM\\workspace\\test\\src\\pack\\grammarSample.g:13:5: ( ( IDENT )+ )
            // C:\\Users\\Unicamp-VM\\workspace\\test\\src\\pack\\grammarSample.g:13:7: ( IDENT )+
            {
            // C:\\Users\\Unicamp-VM\\workspace\\test\\src\\pack\\grammarSample.g:13:7: ( IDENT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Unicamp-VM\\workspace\\test\\src\\pack\\grammarSample.g:13:7: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_rule36); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rule"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_rule36 = new BitSet(new long[]{0x0000000000000012L});

}