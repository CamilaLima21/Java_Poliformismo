// Contrato autenticavel (quem assina esse contrato precisa implementar: m?todo setSenha e o m?todo autentica
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);	

	public abstract boolean autentica(int senha);
}
