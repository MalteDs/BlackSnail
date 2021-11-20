package model;
/**
 * The class Season extends the class Serie and represents an object
 */
public class Season extends Serie{
    //Atributes
    int numSeason;
    int numEpisodes;
    //Relations

    /**
     * Method constructor
     * @param nameProduct
     * @param nameDirector
     * @param sinopsis
     * @param trailer
     * @param dateFirtsE
     * @param nameProtagonist1
     * @param nameProtagonist2
     * @param censure
     * @param numSeason
     * @param numEpisodes
     */
    public Season(String nameProduct,String nameDirector, String sinopsis,String trailer,String dateFirtsE,String nameProtagonist1,String nameProtagonist2,String censure,int numSeason, int numEpisodes){
        super(nameProduct,nameDirector,sinopsis,trailer,dateFirtsE,nameProtagonist1,nameProtagonist2,censure);
        this.numSeason=numSeason;
        this.numEpisodes=numEpisodes;
    }
    public int getNumSeason(){
        return numSeason;
    }
    public void setNumSeason(int numSeason){
        this.numSeason=numSeason;
    }
    public int getNumEpisodes(){
        return numEpisodes;
    }
    public void setNumEpisodes(int numEpisodes){
        this.numEpisodes=numEpisodes;
    }
    public String toString(){
        String message=super.toString()+"Season: "+getNumSeason()+"\n";
        message+="Episodes number"+getNumEpisodes()+"\n";
        return message;
    }
}
