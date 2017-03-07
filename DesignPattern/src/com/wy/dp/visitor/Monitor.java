
package com.wy.dp.visitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        computerPartVisitor.visit(this);
    }
}
