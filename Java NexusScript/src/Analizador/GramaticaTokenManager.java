/* Generated By:JavaCC: Do not edit this line. GramaticaTokenManager.java */
//analiza el codigo.txt

package Analizador;

/** Token Manager. */
public class GramaticaTokenManager implements GramaticaConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3ffe0L) != 0L)
         {
            jjmatchedKind = 33;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x4c00L) != 0L)
            return 2;
         if ((active0 & 0x3b3e0L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 1;
            }
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0x1040L) != 0L)
            return 2;
         if ((active0 & 0x3aba0L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
            return 2;
         }
         return -1;
      case 3:
         if ((active0 & 0x20000L) != 0L)
            return 2;
         if ((active0 & 0x1aba0L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0xa820L) != 0L)
            return 2;
         if ((active0 & 0x10380L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 4;
            return 2;
         }
         return -1;
      case 5:
         if ((active0 & 0x300L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 5;
            return 2;
         }
         if ((active0 & 0x10080L) != 0L)
            return 2;
         return -1;
      case 6:
         if ((active0 & 0x200L) != 0L)
            return 2;
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 6;
            return 2;
         }
         return -1;
      case 7:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 7;
            return 2;
         }
         return -1;
      case 8:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 8;
            return 2;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 37:
         return jjStopAtPos(0, 25);
      case 40:
         return jjStopAtPos(0, 29);
      case 41:
         return jjStopAtPos(0, 30);
      case 42:
         return jjStopAtPos(0, 23);
      case 43:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 45:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 47:
         return jjStopAtPos(0, 24);
      case 59:
         return jjStopAtPos(0, 26);
      case 61:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 91:
         return jjStopAtPos(0, 31);
      case 93:
         return jjStopAtPos(0, 32);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0xc00L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x380L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 123:
         return jjStopAtPos(0, 27);
      case 125:
         return jjStopAtPos(0, 28);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 43:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      case 45:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 61:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20380L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 70:
      case 102:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 79:
      case 111:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 68:
      case 100:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 2);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 82:
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x380L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 69:
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 2);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 75:
      case 107:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 2);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 84:
      case 116:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 2);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 78:
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 2);
         break;
      case 84:
      case 116:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 82:
      case 114:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(6, 9, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 77:
      case 109:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 76:
      case 108:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(9, 8, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 4;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 0:
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAdd(3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAddTwoStates(2, 1);
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 4 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, "\53\53", "\55\55", "\75\75", "\53", "\55", "\52", 
"\57", "\45", "\73", "\173", "\175", "\50", "\51", "\133", "\135", null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x7ffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[4];
private final int[] jjstateSet = new int[8];
StringBuffer image;
int jjimageLen;
int lengthOfMatch;
protected char curChar;
/** Constructor. */
public GramaticaTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public GramaticaTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 4; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   tokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 5 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                      System.out.println("START ->"+ img + "\n");
         break;
      case 6 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                  System.out.println("END ->"+ img + "\n");
         break;
      case 7 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             System.out.println("PR_INTERGER ->"+ img + "\n");
         break;
      case 8 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                System.out.println("PR_DECIMAL ->"+ img + "\n");
         break;
      case 9 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                         System.out.println("PR_TXT ->"+ img + "\n");
         break;
      case 10 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   System.out.println("PR_IF ->"+ img + "\n");
         break;
      case 11 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                        System.out.println("PR_ELSE ->"+ img + "\n");
         break;
      case 12 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                     System.out.println("PR_FOR ->"+ img + "\n");
         break;
      case 13 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                         System.out.println("PR_WHILE ->"+ img + "\n");
         break;
      case 14 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                   System.out.println("PR_DO ->"+ img + "\n");
         break;
      case 15 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                         System.out.println("PR_BREAK ->"+ img + "\n");
         break;
      case 16 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                           System.out.println("PR_RETURN ->"+ img + "\n");
         break;
      case 17 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                       System.out.println("PR_CASE ->"+ img + "\n");
         break;
      case 18 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                       System.out.println("INCREMENT ->"+ img + "\n");
         break;
      case 19 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                       System.out.println("DECREMENT ->"+ img + "\n");
         break;
      case 20 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                      System.out.println("IQUAL_TO ->"+ img + "\n");
         break;
      case 21 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                System.out.println("SUM ->"+ img + "\n");
         break;
      case 22 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                  System.out.println("MINUS ->"+ img + "\n");
         break;
      case 23 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                     System.out.println("MULTIPLY ->"+ img + "\n");
         break;
      case 24 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                   System.out.println("DEVIDE ->"+ img + "\n");
         break;
      case 25 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                       System.out.println("REMEAINDER ->"+ img + "\n");
         break;
      case 26 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                       System.out.println("DELIMITADOR ->"+ img + "\n");
         break;
      case 27 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                       System.out.println("BRACE_OPEN ->"+ img + "\n");
         break;
      case 28 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
                        System.out.println("BRACE_CLOSE ->"+ img + "\n");
         break;
      case 29 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                             System.out.println("PARENTHESIS_OPEN ->"+ img + "\n");
         break;
      case 30 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[30]);
        lengthOfMatch = jjstrLiteralImages[30].length();
                              System.out.println("PARENTHESIS_CLOSE ->"+ img + "\n");
         break;
      case 31 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[31]);
        lengthOfMatch = jjstrLiteralImages[31].length();
                         System.out.println("BRACKET_OPEN ->"+ img + "\n");
         break;
      case 32 :
        if (image == null)
            image = new StringBuffer();
        image.append(jjstrLiteralImages[32]);
        lengthOfMatch = jjstrLiteralImages[32].length();
                          System.out.println("BRACKET_CLOSE ->"+ img + "\n");
         break;
      case 33 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                System.out.println("ID ->"+ img + "\n");
         break;
      case 34 :
        if (image == null)
            image = new StringBuffer();
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                            System.out.println("NUMBER ->"+ img + "\n");
         break;
      default : 
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}