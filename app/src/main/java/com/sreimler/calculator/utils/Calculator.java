/*
 * Copyright 2016 Sören Reimler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sreimler.calculator.utils;

import com.sreimler.calculator.models.Operand;
import com.sreimler.calculator.models.Operator;

/**
 * Performs the actual calculations.
 */
public class Calculator {

    public String performCalculation(Operand firstOperand, Operand secondOperand, Operator operator) {
        int a = Integer.valueOf(firstOperand.getValue());
        int b = Integer.valueOf(secondOperand.getValue());

        int result = 0;

        switch (operator) {
            case PLUS:
                result = a+b;
                break;
            case MINUS:
                result = a-b;
                break;
            case MULTIPLY:
                result = a*b;
                break;
            case DIVIDE:
                result = a/b;
                break;
        }

        return Integer.toString(result);
    }
}
