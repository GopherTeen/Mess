/*
    Rust 学习  2024.11.22
*/

// 函数由一系列语句组成，可由表达式结尾
//
// 循环: loop  while  for

fn main() {
    let y = {
        let x = 1;
        x + 1
    };
    println!("{}", y);
    println!("{}", plus_one(y));

    let mut cnt = 8;
    let x: i32 = loop {
        cnt += 1;
        if cnt == 10 {
            break cnt * 2;
        } else {
            println!("{}", cnt);
        }
    };
    println!("{}", x);
}

fn plus_one(x: i32) -> i32 {
    x + 1
}