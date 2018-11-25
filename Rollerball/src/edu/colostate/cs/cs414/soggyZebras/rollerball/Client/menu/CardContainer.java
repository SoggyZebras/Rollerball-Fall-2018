package edu.colostate.cs.cs414.soggyZebras.rollerball.Client.menu;

import javax.swing.*;
import java.awt.*;

/**
 * holds all of the cards that represent the different menus
 */
public class CardContainer extends JPanel {

    public CardContainer(MenuGUI menuGUI) {
        super(new CardLayout());

        // create menus
        MenuPanel regLogin = new RegLoginPanel(menuGUI);
        add("register_login", regLogin);
        MenuPanel reg = new RegPanel(menuGUI);
        add("register", reg);
        MenuPanel login = new LoginPanel(menuGUI);
        add("login", login);
        MenuPanel mainMenu = new MainMenuPanel(menuGUI);
        add("main_menu", mainMenu);
        MenuPanel currentGames = new CurrentGamesPanel(menuGUI);
        add("current_games", currentGames);
        MenuPanel createInvitePanel = new CreateInvitePanel(menuGUI);
        add("create_invite", createInvitePanel);
        MenuPanel pendingInvitesPanel = new PendingInvitesPanel(menuGUI);
        add("pending_invites", pendingInvitesPanel);

        // TODO: add more cards here
    }

    public void show(String cardName) {
        CardLayout layout = (CardLayout)getLayout();
        layout.show(this, cardName);
    }
}
