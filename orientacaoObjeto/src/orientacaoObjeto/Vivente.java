package orientacaoObjeto;

public interface Vivente {
	public void morrer(CausaMorte motivo);
	public abstract void nascer(Modo modo);
}
