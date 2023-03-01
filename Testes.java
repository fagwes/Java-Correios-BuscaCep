package testes;

import java.io.IOException;

import executa.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import massadedados.MassadeDados;
import metodos.Metodos;

public class Testes extends MassadeDados {

	// Teste Positivo //
	@Given("que eu esteja no site dos correios")
	public void que_eu_esteja_no_site_dos_correios() {
		Executa.abrirNavegador();
		Metodos.clicar(aceitacookies);
		Metodos.maximiza();

	}

	@Given("clico em busca de cep")
	public void clico_em_busca_de_cep() {
		Metodos.clicar(barradebusca);

	}

	@When("digito o cep e aperto enter")
	public void digito_o_cep_e_aperto_enter() {
		Metodos.escrever(barradebusca, cep);
		Metodos.enter(barradebusca);
	}

	@Then("sou redirecionado para o resultado de busca")
	public void sou_redirecionado_para_o_resultado_de_busca() throws IOException {

		Executa.evidencia(cep);
		Executa.fecharNavegador();

	}

	// Teste Negativo //

	@When("digito o cep com uma letra e aperto enter")
	public void digito_o_cep_com_uma_letra_e_aperto_enter() throws IOException {

		Metodos.escrever(barradebusca, cep);

	}

	@When("dados não encontrado")
	public void dados_não_encontrado() throws IOException {
		Executa.evidencia(ceperrado);
		Metodos.fecharNavegador();
	}

}
