package projetoE;

public class mandarmensagem {
	
	private String msg;

	public mandarmensagem(String mens) {
		this.msg = mens;
	}

	public String mandar() {
		System.out.println(this.msg);
		return this.msg;
	}
}
