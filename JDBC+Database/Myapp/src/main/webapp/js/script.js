function inputCheck() {
    // 아이디 입력 체크
    if (document.regForm.id.value == "") {
        alert("아이디를 입력해주세요");
        document.regForm.id.focus();
        return;
    }

    // 패스워드 입력 체크
    if (document.regForm.pwd.value == "") {
        alert("패스워드를 입력해주세요");
        document.regForm.pwd.focus();
        return;
    }

    // 패스워드 확인 체크
    if (document.regForm.repwd.value == "") {
        alert("패스워드를 확인해주세요");
        document.regForm.repwd.focus();
        return;
    }

    // 이름 입력 체크
    if (document.regForm.name.value == "") {
        alert("이름을 입력해주세요");
        document.regForm.name.focus();
        return;
    }

    // 생년월일 입력 체크
    if (document.regForm.birth.value == "") {
        alert("생년월일을 입력해주세요");
        document.regForm.birth.focus();
        return;
    }

    // 이메일 입력 체크
    if (document.regForm.email.value == "") {
        alert("이메일을 입력해주세요");
        document.regForm.email.focus();
        return;
    }

    // 패스워드와 확인 패스워드 일치 체크
    if (document.regForm.pwd.value != document.regForm.repwd.value) {
        alert("패스워드가 일치하지 않습니다");
        document.regForm.repwd.focus();
        return;
    }

    // 모든 필드가 유효하면 폼을 제출
    document.regForm.submit();
}
