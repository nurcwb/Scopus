package orientacaoObjeto;

public enum GrauSatisfacao {
	MUITO_BOM, BOM, RAZOAVEL, HORRIVEL, REJEITAR;

	@Override
	public String toString() {
		switch (this) {
		case MUITO_BOM:
			return "Huuuuuuuuuuuuuuuuuuuum";

		case BOM:
			return "huuum";
		case RAZOAVEL:
			return "___";
		case HORRIVEL:
			return "argghh";
		case REJEITAR:
			return "huuuuugo";
		default:
			return null;
		}
	}

}
