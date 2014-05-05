/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 31/ott/2013
 * Copyright 2013 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.ui;

import static org.sejda.eventstudio.StaticStudio.eventStudio;
import javafx.scene.layout.StackPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.pdfsam.ui.dashboard.Dashboard;
import org.pdfsam.ui.workarea.Workarea;

/**
 * Panel containing the main area where the modules pane and the dashboard pane are displayed
 * 
 * @author Andrea Vacondio
 * 
 */
@Named
public class ContentPane extends StackPane {

    @Inject
    private Workarea modules;
    @Inject
    private Dashboard dashboard;

    @PostConstruct
    private void init() {
        getChildren().addAll(modules, dashboard);
        eventStudio().addAnnotatedListeners(this);
    }

}
