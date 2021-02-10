package com.cosc457.gui;
import com.cosc457.models.*;
import net.miginfocom.swing.MigLayout;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Navigation extends JPanel{

    JPanel navigationPanel = new JPanel();

    AddConference addConference = new AddConference();
    UpdateConference UpdateConference = new UpdateConference();
    DeleteConference deleteConference = new DeleteConference();
    ViewConference viewConference = new ViewConference();

    AddDivision AddDivision = new AddDivision();
    UpdateDivision UpdateDivision = new UpdateDivision();
    DeleteDivision DeleteDivision = new DeleteDivision();
    ViewDivision ViewDivision = new ViewDivision();

    AddTeam AddTeam = new AddTeam();
    UpdateTeam UpdateTeam = new UpdateTeam();
    DeleteTeam DeleteTeam = new DeleteTeam();
    ViewTeam ViewTeam = new ViewTeam();

    AddPlayer AddPlayer = new AddPlayer();
    UpdatePlayer UpdatePlayer = new UpdatePlayer();
    DeletePlayer DeletePlayer = new DeletePlayer();
    ViewPlayer ViewPlayer = new ViewPlayer();

    AddCoach AddCoach = new AddCoach();
    UpdateCoach UpdateCoach = new UpdateCoach();
    DeleteCoach DeleteCoach = new DeleteCoach();
    ViewCoach ViewCoach = new ViewCoach();

    AddTeam_Owner AddTeam_Owner = new AddTeam_Owner();
    UpdateTeam_Owner UpdateTeam_Owner = new UpdateTeam_Owner();
    DeleteTeam_Owner DeleteTeam_Owner = new DeleteTeam_Owner();
    ViewTeam_Owner ViewTeam_Owner = new ViewTeam_Owner();

    AddContract AddContract = new AddContract();
    UpdateContract UpdateContract = new UpdateContract();
    DeleteContract DeleteContract = new DeleteContract();
    ViewContract ViewContract = new ViewContract();

    AddScout AddScout = new AddScout();
    UpdateScout UpdateScout = new UpdateScout();
    DeleteScout DeleteScout = new DeleteScout();
    ViewScout ViewScout = new ViewScout();

    AddScouting_Report AddScouting_Report = new AddScouting_Report();
    UpdateScouting_Report UpdateScouting_Report = new UpdateScouting_Report();
    DeleteScouting_Report DeleteScouting_Report = new DeleteScouting_Report();
    ViewScouting_Report ViewScouting_Report = new ViewScouting_Report();

    AddFan_Demographics AddFan_Demographics = new AddFan_Demographics();
    UpdateFan_Demographics UpdateFan_Demographics = new UpdateFan_Demographics();
    DeleteFan_Demographics DeleteFan_Demographics = new DeleteFan_Demographics();
    ViewFan_Demographics ViewFan_Demographics = new ViewFan_Demographics();

    public static Navigation INSTANCE;

    private JButton addConferenceButton;
    private JButton UpdateConferenceButton;

    private JButton deleteConferenceButton;
    private JButton viewConferencesButton;

    private JButton addDivisionButton;
    private JButton UpdateDivisionButton;
    private JButton deleteDivisionButton;
    private JButton viewDivisionButton;

    private JButton addTeamButton;
    private JButton UpdateTeamButton;
    private JButton deleteTeamButton;
    private JButton viewTeamButton;

    private JButton addPlayerButton;
    private JButton updatePlayerButton;
    private JButton deletePlayerButton;
    private JButton viewPlayerButton;

    private JButton addCoachButton;
    private JButton UpdateCoachButton;
    private JButton deleteCoachButton;
    private JButton viewCoachButton;

    private JButton addTeam_OwnerButton;
    private JButton UpdateTeam_OwnerButton;
    private JButton deleteTeam_OwnerButton;
    private JButton viewTeam_OwnerButton;

    private JButton addContractButton;
    private JButton UpdateContractButton;
    private JButton deleteContractButton;
    private JButton viewContractButton;

    private JButton addScoutButton;
    private JButton UpdateScoutButton;
    private JButton deleteScoutButton;
    private JButton viewScoutButton;

    private JButton addScouting_ReportButton;
    private JButton UpdateScouting_ReportButton;
    private JButton deleteScouting_ReportButton;
    private JButton viewScouting_ReportButton;

    private JButton addFan_DemographicsButton;
    private JButton UpdateFan_DemographicsButton;
    private JButton deleteFan_DemographicsButton;
    private JButton viewFan_DemographicsButton;

    private BufferedImage myPicture;

    private JLabel ConferenceLabel;
    private JLabel DivisionLabel;
    private JLabel PlayerLabel;
    private JLabel TeamLabel;
    private JLabel CoachLabel;
    private JLabel Team_OwnerLabel;
    private JLabel ContractLabel;
    private JLabel ScoutLabel;
    private JLabel Scouting_ReportLabel;
    private JLabel Fan_DemographicsLabel;


    private Navigation(){
        super(new BorderLayout());
        String imgPath = "Images/nfl2.png";
        try {
            myPicture = ImageIO.read(getClass().getResourceAsStream(imgPath));
        } catch (IOException ie)
        {
            ie.printStackTrace();
        }
        createMenu();
        add(navigationPanel);
        navigationPanel.setSize(500,600);
        initListeners();
    }

    public static Navigation getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Navigation();
        }
        return INSTANCE;
    }

    private void createMenu(){
        navigationPanel.setLayout(new MigLayout("center"));

        ConferenceLabel = new JLabel("Conference Options",JLabel.CENTER);
        addConferenceButton       = new JButton("Add Conference");
        UpdateConferenceButton       = new JButton("Update Conference");
        deleteConferenceButton    = new JButton("Delete Conference");
        viewConferencesButton     = new JButton("View Conference");

        DivisionLabel = new JLabel("Division Options",JLabel.CENTER);
        addDivisionButton   = new JButton("Add Division");
        UpdateDivisionButton   = new JButton("Update Division");
        deleteDivisionButton = new JButton("Delete Division");
        viewDivisionButton = new JButton("View Divisions");

        TeamLabel = new JLabel("Team Options",JLabel.CENTER);
        addTeamButton   = new JButton("Add Team");
        UpdateTeamButton   = new JButton("Update Team");
        deleteTeamButton = new JButton("Delete Team");
        viewTeamButton = new JButton("View Team");

        PlayerLabel = new JLabel("Player Options",JLabel.CENTER);
        addPlayerButton   = new JButton("Add Player");
        updatePlayerButton   = new JButton("Update Player");
        deletePlayerButton = new JButton("Delete Player");
        viewPlayerButton = new JButton("View Players");

        CoachLabel = new JLabel("Coach Options",JLabel.CENTER);
        addCoachButton   = new JButton("Add Coach");
        UpdateCoachButton   = new JButton("Update Coach");
        deleteCoachButton = new JButton("Delete Coach");
        viewCoachButton = new JButton("View Coaches");

        Team_OwnerLabel = new JLabel("Team Owner Options",JLabel.CENTER);
        addTeam_OwnerButton   = new JButton("Add Team Owner");
        UpdateTeam_OwnerButton   = new JButton("Update Team Owner");
        deleteTeam_OwnerButton = new JButton("Delete Team Owner");
        viewTeam_OwnerButton = new JButton("View Team Owners");

        ContractLabel = new JLabel("Contract Options",JLabel.CENTER);
        addContractButton   = new JButton("Add Contract");
        UpdateContractButton   = new JButton("Update Contract");
        deleteContractButton = new JButton("Delete Contract");
        viewContractButton = new JButton("View Contracts");

        ScoutLabel = new JLabel("Scout Options",JLabel.CENTER);
        addScoutButton   = new JButton("Add Scout");
        UpdateScoutButton   = new JButton("Update Scout");
        deleteScoutButton = new JButton("Delete Scout");
        viewScoutButton = new JButton("View Scouts");

        Scouting_ReportLabel = new JLabel("Scouting Reports Options",JLabel.CENTER);
        addScouting_ReportButton   = new JButton("Add Report");
        UpdateScouting_ReportButton   = new JButton("Update Report");
        deleteScouting_ReportButton = new JButton("Delete Report");
        viewScouting_ReportButton = new JButton("View Reports");

        Fan_DemographicsLabel = new JLabel("Fan Demographics Options",JLabel.CENTER);
        addFan_DemographicsButton   = new JButton("Add Fan Demographics");
        UpdateFan_DemographicsButton   = new JButton("Upd. Demographics");
        deleteFan_DemographicsButton = new JButton("Del. Demographics");
        viewFan_DemographicsButton = new JButton("View Demographics");

        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        navigationPanel.add(picLabel, "height 150, width 150, wrap");

        navigationPanel.add(ConferenceLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addConferenceButton, "align center, width 50:150:150, cell 0 2");
        navigationPanel.add(UpdateConferenceButton, "align center, width 50:150:150, cell 0 2");
        navigationPanel.add(deleteConferenceButton, "align center, width 50:150:150, cell 0 2");
        navigationPanel.add(viewConferencesButton, "align center, width 50:150:150, cell 0 2, wrap");

        navigationPanel.add(DivisionLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addDivisionButton, "align center, width 50:150:150, cell 0 4");
        navigationPanel.add(UpdateDivisionButton, "align center, width 50:150:150, cell 0 4");
        navigationPanel.add(deleteDivisionButton, "align center, width 50:150:150, cell 0 4");
        navigationPanel.add(viewDivisionButton, "align center, width 50:150:150, cell 0 4, wrap");

        navigationPanel.add(TeamLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addTeamButton, "align center, width 50:150:150, cell 0 6");
        navigationPanel.add(UpdateTeamButton, "align center, width 50:150:150, cell 0 6");
        navigationPanel.add(deleteTeamButton, "align center, width 50:150:150, cell 0 6");
        navigationPanel.add(viewTeamButton, "align center, width 50:150:150, cell 0 6, wrap");

        navigationPanel.add(PlayerLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addPlayerButton, "align center, width 50:150:150, cell 0 8");
        navigationPanel.add(updatePlayerButton, "align center, width 50:150:150, cell 0 8");
        navigationPanel.add(deletePlayerButton, "align center, width 50:150:150, cell 0 8");
        navigationPanel.add(viewPlayerButton, "align center, width 50:150:150, cell 0 8, wrap");

        navigationPanel.add(CoachLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addCoachButton, "align center, width 50:150:150, cell 0 10");
        navigationPanel.add(UpdateCoachButton, "align center, width 50:150:150, cell 0 10");
        navigationPanel.add(deleteCoachButton, "align center, width 50:150:150, cell 0 10");
        navigationPanel.add(viewCoachButton, "align center, width 50:150:150, cell 0 10, wrap");

        navigationPanel.add(Team_OwnerLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addTeam_OwnerButton, "align center, width 50:150:150, cell 0 12");
        navigationPanel.add(UpdateTeam_OwnerButton, "align center, width 50:150:150, cell 0 12");
        navigationPanel.add(deleteTeam_OwnerButton, "align center, width 50:150:150, cell 0 12");
        navigationPanel.add(viewTeam_OwnerButton, "align center, width 50:150:150, cell 0 12, wrap");

        navigationPanel.add(ContractLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addContractButton, "align center, width 50:150:150, cell 0 14");
        navigationPanel.add(UpdateContractButton, "align center, width 50:150:150, cell 0 14");
        navigationPanel.add(deleteContractButton, "align center, width 50:150:150, cell 0 14");
        navigationPanel.add(viewContractButton, "align center, width 50:150:150, cell 0 14, wrap");

        navigationPanel.add(ScoutLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addScoutButton, "align center, width 50:150:150, cell 0 16");
        navigationPanel.add(UpdateScoutButton, "align center, width 50:150:150, cell 0 16");
        navigationPanel.add(deleteScoutButton, "align center, width 50:150:150, cell 0 16");
        navigationPanel.add(viewScoutButton, "align center, width 50:150:150, cell 0 16, wrap");

        navigationPanel.add(Scouting_ReportLabel, "align center, width 50:150:150, height 40, wrap");
        navigationPanel.add(addScouting_ReportButton, "align center, width 50:150:150, cell 0 18");
        navigationPanel.add(UpdateScouting_ReportButton, "align center, width 50:150:150, cell 0 18");
        navigationPanel.add(deleteScouting_ReportButton, "align center, width 50:150:150, cell 0 18");
        navigationPanel.add(viewScouting_ReportButton, "align center, width 50:150:150, cell 0 18, wrap");

        navigationPanel.add(Fan_DemographicsLabel, "align center, width 50:250:250, height 40, wrap");
        navigationPanel.add(addFan_DemographicsButton, "align center, width 50:150:150, cell 0 20");
        navigationPanel.add(UpdateFan_DemographicsButton, "align center, width 50:150:150, cell 0 20");
        navigationPanel.add(deleteFan_DemographicsButton, "align center, width 50:150:150, cell 0 20");
        navigationPanel.add(viewFan_DemographicsButton, "align center, width 50:150:150, cell 0 20");

    }

    private void initListeners(){

        addConferenceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(addConference.getPanel());
                redraw();
            }
        });

        UpdateConferenceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateConference.getPanel());
                redraw();
            }
        });

        deleteConferenceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(deleteConference.getPanel());
                redraw();
            }
        });

        viewConferencesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(viewConference.getPanel());
                viewConference.load();
                redraw();
            }
        });

        addDivisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddDivision.getPanel());
                redraw();
            }
        });

        UpdateDivisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateDivision.getPanel());
                redraw();
            }
        });

        deleteDivisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeleteDivision.getPanel());
                redraw();
            }
        });

        viewDivisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewDivision.getPanel());
                ViewDivision.load();
                redraw();
            }
        });

        addTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddTeam.getPanel());
                redraw();
            }
        });

        UpdateTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateTeam.getPanel());
                redraw();
            }
        });

        deleteTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeleteTeam.getPanel());
                redraw();
            }
        });

        viewTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewTeam.getPanel());
                ViewTeam.load();
                redraw();
            }
        });

        addPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddPlayer.getPanel());
                redraw();
            }
        });

        updatePlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdatePlayer.getPanel());
                redraw();
            }
        });

        deletePlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeletePlayer.getPanel());
                redraw();
            }
        });

        viewPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewPlayer.getPanel());
                ViewPlayer.load();
                redraw();
            }
        });

        addCoachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddCoach.getPanel());
                redraw();
            }
        });

        UpdateCoachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateCoach.getPanel());
                redraw();
            }
        });

        deleteCoachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeleteCoach.getPanel());
                redraw();
            }
        });

        viewCoachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewCoach.getPanel());
                ViewCoach.load();
                redraw();
            }
        });

        addTeam_OwnerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddTeam_Owner.getPanel());
                redraw();
            }
        });

        UpdateTeam_OwnerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateTeam_Owner.getPanel());
                redraw();
            }
        });

        deleteTeam_OwnerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeleteTeam_Owner.getPanel());
                redraw();
            }
        });

        viewTeam_OwnerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewTeam_Owner.getPanel());
                ViewTeam_Owner.load();
                redraw();
            }
        });

        addContractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddContract.getPanel());
                redraw();
            }
        });

        UpdateContractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateContract.getPanel());
                redraw();
            }
        });

        deleteContractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeleteContract.getPanel());
                redraw();
            }
        });

        viewContractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewContract.getPanel());
                ViewContract.load();
                redraw();
            }
        });

        addScoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddScout.getPanel());
                redraw();
            }
        });

        UpdateScoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateScout.getPanel());
                redraw();
            }
        });

        deleteScoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeleteScout.getPanel());
                redraw();
            }
        });

        viewScoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewScout.getPanel());
                ViewScout.load();
                redraw();
            }
        });

        addScouting_ReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddScouting_Report.getPanel());
                redraw();
            }
        });

        UpdateScouting_ReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateScouting_Report.getPanel());
                redraw();
            }
        });

        deleteScouting_ReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeleteScouting_Report.getPanel());
                redraw();
            }
        });

        viewScouting_ReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewScouting_Report.getPanel());
                ViewScouting_Report.load();
                redraw();
            }
        });

        addFan_DemographicsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(AddFan_Demographics.getPanel());
                redraw();
            }
        });

        UpdateFan_DemographicsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(UpdateFan_Demographics.getPanel());
                redraw();
            }
        });

        deleteFan_DemographicsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(DeleteFan_Demographics.getPanel());
                redraw();
            }
        });

        viewFan_DemographicsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                remove(getComponent(0));
                add(ViewFan_Demographics.getPanel());
                ViewFan_Demographics.load();
                redraw();
            }
        });
    }

    public void goBack(JPanel p){
       remove(p);
        add(navigationPanel);
        redraw();
    }

    public void replace(JPanel panel){
        remove(getComponent(0));
        add(panel);
        redraw();

    }

    public void redraw(){
        repaint();
        revalidate();
    }


}
