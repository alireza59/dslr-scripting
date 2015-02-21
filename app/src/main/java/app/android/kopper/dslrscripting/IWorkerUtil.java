package app.android.kopper.dslrscripting;

import app.android.kopper.dslrscripting.inputer.IInputer;

/**
 * Created by kopper on 2015-02-08.
 * (C) Copyright 2015 kopperek@gmail.com
 * <p/>
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 * <p/>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
public interface IWorkerUtil {
    boolean isInterrupted() throws RException;
    void log(String s) throws RException;
    void cameraCommand(PureCommand command) throws RException;
    void waitForNoBusy() throws RException;
    Object input(IInputer inputer) throws RException;
    void waitWhile(int time) throws RException;
}
