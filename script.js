let val1 = null;
let val2 = null;
let outscreen = "";
let add = false;
let sub = false;
let mult = false;
let divi = false;

/*------------------Number Buttons-----------------------*/

const buttondot = () => {
    outscreen = outscreen + ".";
    document.getElementById("output").innerHTML = outscreen;
}

const button1 = () => {
    outscreen = outscreen + "1";
    document.getElementById("output").innerHTML = outscreen;

}

const button2 = () => {
    outscreen = outscreen + "2";
    document.getElementById("output").innerHTML = outscreen;

}

const button3 = () => {
    outscreen = outscreen + "3";
    document.getElementById("output").innerHTML = outscreen;

}

const button4 = () => {
    outscreen = outscreen + "4";
    document.getElementById("output").innerHTML = outscreen;

}

const button5 = () => {
    outscreen = outscreen + "5";
    document.getElementById("output").innerHTML = outscreen;

}

const button6 = () => {
    outscreen = outscreen + "6";
    document.getElementById("output").innerHTML = outscreen;

}

const button7 = () => {
    outscreen = outscreen + "7";
    document.getElementById("output").innerHTML = outscreen;

}

const button8 = () => {
    outscreen = outscreen + "8";
    document.getElementById("output").innerHTML = outscreen;

}

const button9 = () => {
    outscreen = outscreen + "9";
    document.getElementById("output").innerHTML = outscreen;

}

const button0 = () => {
    outscreen = outscreen + "0";
    document.getElementById("output").innerHTML = outscreen;
}

/*-------------------------------------------------------*/


/*-----------Function buttons----------------------------*/

const buttonclear = () => {
    val1 = null;
    val2 = null;
    outscreen = "";
    add = false;
    sub = false;
    mult = false;
    divi = false;
    document.getElementById("output").innerHTML = outscreen;
}

const buttonadd = () => {
    if (val1 == null){
        val1 = parseFloat(outscreen);
        add = true;
        sub = false;
        mult = false;
        divi = false;
        outscreen = "";
        document.getElementById("output").innerHTML = outscreen;
    }
    
    
}

const buttonsub = () => {
    if (val1 == null){
        val1 = parseFloat(outscreen);
        sub = true;
        add = false;
        mult = false;
        divi = false;
        outscreen = "";
        document.getElementById("output").innerHTML = outscreen;
    }
}

const buttonmult = () => {
    if (val1 == null){
        val1 = parseFloat(outscreen);
        sub = false;
        add = false;
        mult = true;
        divi = false;
        outscreen = "";
        document.getElementById("output").innerHTML = outscreen;
    }
}

const buttondivi = () => {
    if (val1 == null){
        val1 = parseFloat(outscreen);
        sub = false;
        add = false;
        mult = false;
        divi = true;
        outscreen = "";
        document.getElementById("output").innerHTML = outscreen;
    }
}

const buttoneq = () => {
    if (add){
        val2 = parseFloat(outscreen);
        outscreen = val1 + val2;
        add = false;
        document.getElementById("output").innerHTML = outscreen;
        val1 = null;
        val2 = null;

    }

    if (sub){
        val2 = parseFloat(outscreen);
        outscreen = val1 - val2;
        sub = false;
        document.getElementById("output").innerHTML = outscreen;
        val1 = null;
        val2 = null;
    }

    if (mult){
        val2 = parseFloat(outscreen);
        outscreen = val1 * val2;
        mult = false;
        document.getElementById("output").innerHTML = outscreen;
        val1 = null;
        val2 = null;
    }

    if (divi){
        val2 = parseFloat(outscreen);
        outscreen = val1 / val2;
        divi = false;
        document.getElementById("output").innerHTML = outscreen;
        val1 = null;
        val2 = null;
    }
}
