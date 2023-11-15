package jpaboot.jpashop.controller;

import jpaboot.jpashop.domain.Member;
import jpaboot.jpashop.domain.item.Item;
import jpaboot.jpashop.service.ItemService;
import jpaboot.jpashop.service.MemberService;
import jpaboot.jpashop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final MemberService memberService;
    private final ItemService itemService;

    @GetMapping(value = "/order")
    String createForm (Model model) {

    List<Member> members = memberService.findMembers();
    List<Item> items = itemService.findItems();

    model.addAttribute("members", members);
    model.addAttribute("items", items);

    return "order/orderForm";
    }
}
