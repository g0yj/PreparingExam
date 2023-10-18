console.log('js실행')

function write(){
    console.log('write함수 실행')
    let name= document.querySelector('.name').value;
    let price= document.querySelector('.price').value;
    $.ajax({
            url : "/account",
            method : "post",
            data : JSON.stringify({name:name, price:price}),
            contentType: "application/json;charset=UTF-8",
            success : r=>{
                console.log('post통신성공');console.log(r)
                read();
                } ,
            error : e=>{console.log('post통신실패')} ,
       });
}

read();
function read(){
    $.ajax({
            url : "/account",
            method : "get",
            data : {},
            success : r=>{
                console.log('get통신성공');console.log(r)

                let input=document.querySelector('.input');
                input.innerHTML=
                `
                        <input class="name" type="text" placeholder="항목">
                        <input class="price"type="text" placeholder="가격">
                        <button onclick="write()"type="button">등록</button>
                `;


                let html=``;
                console.log('html');console.log(html);
                r.forEach(e=>{
                       html+=`
                                        <div class="box">
                                            <span class="pname">${e.name}</span>
                                            <span class="pprice">${e.price}</span>
                                            <button onclick="update(${e.ano})" type="button">수정</button>
                                            <button  onclick="delete(${e.ano})" type="button">삭제</button>
                                        </div>
                                       `


                })
    document.querySelector('.print').innerHTML=html;

                } ,
            error : e=>{console.log('get통신실패')} ,
       });
}