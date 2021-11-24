public class HangingMan {

    private int numWrongGuesses;
    private int numRightGuesses;
    String[] HangmanImage = {  
    "\n   Your dog                                   |\n"+
    "       __                                     |\n"+
    "  (___()'`;                                   |\n"+
    "  /,    /`                                    |\n"+
    "  \\\\\"--\\\\                                     |\n"+
    "                                              |\n" +
    "                                              |\n"+
    "   Opponent dog                               |\n" +
    "       __                                     |\n"+
    "  (___()'`;                                   |\n"+
    "  /,    /`                                    |\n"+
    "  \\\\\"--\\\\                                     |\n",
      
    "     Your dog                                 |\n"+
    "         __                                   |\n"+
    "    (___()'`;                                 |\n"+
    "    /,    /`                                  |\n"+
    "    \\\\\"--\\\\                                   |\n"+
    "                                              |\n" +
    "                                              |\n"+
    "        Opponent dog                          |\n" +
    "            __                                |\n"+
    "       (___()'`;                              |\n"+
    "       /,    /`                               |\n"+
    "       \\\\\"--\\\\                                |\n",
    
    "       Your dog                               |\n"+
    "           __                                 |\n"+
    "      (___()'`;                               |\n"+
    "      /,    /`                                |\n"+
    "      \\\\\"--\\\\                                 |\n"+
    "                                              |\n" +
    "                                              |\n"+
    "            Opponent dog                      |\n" +
    "                __                            |\n"+
    "           (___()'`;                          |\n"+
    "           /,    /`                           |\n"+
    "           \\\\\"--\\\\                            |\n",
    
    "         Your dog                             |\n"+
    "             __                               |\n"+
    "        (___()'`;                             |\n"+
    "        /,    /`                              |\n"+
    "        \\\\\"--\\\\                               |\n"+
    "                                              |\n" +
    "                                              |\n"+
    "                Opponent dog                  |\n" +
    "                    __                        |\n"+
    "               (___()'`;                      |\n"+
    "               /,    /`                       |\n"+
    "               \\\\\"--\\\\                        |\n",
    
    "           Your dog                           |\n"+
    "               __                             |\n"+
    "          (___()'`;                           |\n"+
    "          /,    /`                            |\n"+
    "          \\\\\"--\\\\                             |\n"+
    "                                              |\n" +
    "                                              |\n"+
    "                    Opponent dog              |\n" +
    "                        __                    |\n"+
    "                   (___()'`;                  |\n"+
    "                   /,    /`                   |\n"+
    "                   \\\\\"--\\\\                    |\n",

    "             Your dog                         |\n"+
    "                 __                           |\n"+
    "            (___()'`;                         |\n"+
    "            /,    /`                          |\n"+
    "            \\\\\"--\\\\                           |\n"+
    "                                              |\n" +
    "                                              |\n"+
    "                          Opponent dog        |\n" +
    "                              __              |\n"+
    "                         (___()'`;            |\n"+
    "                         /,    /`             |\n"+
    "                         \\\\\"--\\\\              |\n",
    
    "               Your dog                       |\n"+
    "                   __                         |\n"+
    "              (___()'`;                       |\n"+
    "              /,    /`                        |\n"+
    "              \\\\\"--\\\\                         |\n"+
    "                                              |\n" +
    "                                              |\n"+
    "                                  Opponent dog|\n" +
    "                                      __      |\n"+
    "                                 (___()'`;    |\n"+
    "                                 /,    /`     |\n"+
    "                                 \\\\\"--\\\\      |\n"
    

                               
                            };
                            
    public boolean isntDead(){
        return numWrongGuesses<7;
    }
    
    public void dieSomeMore(){
        numWrongGuesses++;
    }
    
    public void show(){
        System.out.println(HangmanImage[numWrongGuesses]);
        System.out.println();
    }
}


