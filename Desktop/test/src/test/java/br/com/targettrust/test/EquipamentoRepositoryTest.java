package br.com.targettrust.test;

import br.com.targettrustrust.springtest.Equipamento;

public class EquipamentoRepositoryTest {

	@Autowired
	EquipamentoReposity repositoy;
	
	@Test
	public void basicInsert () {
		Equipamento equipamento = new Equipamento ();
		equipamento.setDescricao("volante hidraulico");
		repository,save(equipamento);
	}
	
}
