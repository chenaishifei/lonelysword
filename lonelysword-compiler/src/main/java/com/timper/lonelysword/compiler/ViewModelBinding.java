package com.timper.lonelysword.compiler;

import com.squareup.javapoet.CodeBlock;
import javax.rmi.CORBA.Util;

/**
 * User: tangpeng.yang
 * Date: 05/06/2018
 * Description:
 * FIXME
 */
public class ViewModelBinding implements CodeBinding {

  private final String viewModelName;
  private final String fieldName;

  public ViewModelBinding(String fieldName, String viewModelName) {
    this.fieldName = fieldName;
    if (!Utils.isEmpty(viewModelName)) {
      this.viewModelName = viewModelName;
    } else {
      this.viewModelName = fieldName;
    }
  }

  @Override public CodeBlock render() {
    return CodeBlock.of("target.binding.set$L(target.$L);\n",
        viewModelName.substring(0, 1).toUpperCase() + viewModelName.substring(1), viewModelName);
  }

  static final class Builder {
    private String viewModelName;
    private final String fieldName;

    public Builder(String fieldName) {
      this.fieldName = fieldName;
    }

    public void addViewModelName(String viewModelName) {
      this.viewModelName = viewModelName;
    }

    public String getFieldName() {
      return fieldName;
    }

    ViewModelBinding build() {
      return new ViewModelBinding(fieldName, viewModelName);
    }
  }
}
