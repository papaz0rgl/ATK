/* Generated By:JJTree: Do not edit this line. ASTVARIABLE.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orange.atk.interpreter.ast;

import com.orange.atk.interpreter.parser.*;
import com.orange.atk.interpreter.parser.ATKScriptParserVisitor;

public
class ASTVARIABLE extends SimpleNode {
  public ASTVARIABLE(int id) {
    super(id);
  }

  public ASTVARIABLE(ATKScriptParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ATKScriptParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4069c0b9c84c7092dc3a697cc01527ac (do not edit this line) */
