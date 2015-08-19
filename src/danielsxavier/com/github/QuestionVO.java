package danielsxavier.com.github;

public class QuestionVO{
    
    private String resposta;
    private Integer number;
    
    public QuestionVO(int number){
	this.number = number;
    }
    
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Questao: " + this.number;
    }

    @Override
    public boolean equals(Object obj) {
    	QuestionVO outro = (QuestionVO) obj;
    	if(outro.getResposta().equals(this.resposta))
    		return true;
    	else
    		return false;
    }
}
