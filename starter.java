private class Hangman{
    private String guessingWord;
    private int numTries;
    
    public void generateWord(){
        //not shown
    }
    
    public Hangman(){
        guessingWord = generateWord();
        numTries = 5;
    }
    
    public Hangman(int x){
        guessingWord = generateWord();
        numTries = x;
    }
    
    public int guessCheck(String letter, int start){
        
    }
    
    public boolean checkWin(boolean[] arr){
        
    }
}