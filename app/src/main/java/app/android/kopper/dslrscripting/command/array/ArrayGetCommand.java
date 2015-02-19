package app.android.kopper.dslrscripting.command.array;

import java.util.ArrayList;
import java.util.List;

import app.android.kopper.dslrscripting.IWorkerUtil;
import app.android.kopper.dslrscripting.command.AbstractCommand;
import app.android.kopper.dslrscripting.util.ConvertUtil;

/**
 * Created by kopper on 2015-02-15.
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
public class ArrayGetCommand extends AbstractCommand {
    public ArrayGetCommand() {
        super("arrayGet");
    }

    @Override
    public Object execute(ArrayList params,IWorkerUtil util) throws Exception {
        if(params.size()!=2)
            throw new Exception(getName()+" requires two parameters");
        Object obj=params.get(0);
        if(!(obj instanceof List))
            throw new Exception("First parameter has to be an array");
        Integer index=ConvertUtil.toInteger(params.get(1));
        List array=(List)obj;
        if(index>=array.size())
            throw new Exception("Index out of bounds (index: "+index+", array size: "+array.size()+")");
        return(array.get(index));
    }
}
