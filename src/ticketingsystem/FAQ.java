package ticketingsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class FAQ  implements IFile,Serializable {
protected int ID;
protected String Type;
protected String Question;
protected String Answer;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if(ID>=0){
        this.ID = ID;}
        
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        if(Question.length()!=0){
        this.Question = Question;}
       
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        if(Answer.length()!=0){
        this.Answer = Answer;}
       
    }
    
    @Override
    public boolean WritingFile() throws IOException {
         try {
        ObjectOutputStream Bin = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Mohamed\\Desktop\\QuestionsFile.bin")) ;
            Bin.writeObject(TicketingSystem.q);
            Bin.close();
        
        return true;
    }
    catch(IOException ex){
        return false;
    }
           
         
    }

    @Override
    public boolean ReadingFile() throws FileNotFoundException, IOException {
        try{
    ObjectInputStream Inp = new ObjectInputStream(new FileInputStream("C:\\Users\\Mohamed\\Desktop\\QuestionsFile.bin")) ;
            TicketingSystem.q=(ArrayList<FAQ>)Inp.readObject();
            Inp.close();
            return true;
    }
    catch (IOException ex){
        return false;
        
    }   catch (ClassNotFoundException ex) {
           return false;
        }
    
}}