package orientacaoObjeto;

public class Gato extends Animal{

	@Override
	public GrauSatisfacao comer(Alimento alimento) {
		// TODO Auto-generated method stub
		if(alimento.getAzedo()){
			return GrauSatisfacao.RAZOAVEL;
		} else if (alimento.getAzedo()){
			return GrauSatisfacao.REJEITAR;
		}else{
			return GrauSatisfacao.MUITO_BOM;
		}
	}


	@Override
	public Boolean respira(Reagente reagente) {
		if (reagente.equals(Reagente.AGUA)){
			return false;
		} else {
		return true;
		}
	}



	@Override
	public void morrer(CausaMorte motivo) {
		// TODO Auto-generated method stub
		if(motivo.equals(CausaMorte.NATURAL)){
		System.out.println("morte natural");
		}else{
			System.out.println("morte desaba.");
		}
	}

	@Override
	public void nascer(Modo modo) {
		System.out.println("au au!");
		// TODO Auto-generated method stub
		if(modo.equals(Modo.ASSISTIDO)){
			System.out.println("Assistido");
		}else{
			System.out.println("Normal");
		}
	}

}
