package com.exemplo.agenda;

import javax.swing.SwingUtilities;

import com.exemplo.agenda.controller.ContatoController;
import com.exemplo.agenda.model.ContatoModel;
import com.exemplo.agenda.view.ContatoView;
/**
 * Classe principal que inicializa a aplicação Agenda de Contatos.
 * Responsável por criar as instâncias dos componentes MVC e iniciar a interface.
 *
 * @author Taynara Raquel
 * @version 1.0
 */
public class AgendaContatos {

    public static void main(String[] args) {
        // Executa a inicialização da aplicação na thread de eventos do Swing
        SwingUtilities.invokeLater(() -> {
            // Criação das instâncias de View, Model e Controller
            ContatoView view = new ContatoView();
            ContatoModel model = new ContatoModel();
            new ContatoController(view, model);

            // Tornando a interface gráfica visível
            view.setVisible(true);
        });
    }
}