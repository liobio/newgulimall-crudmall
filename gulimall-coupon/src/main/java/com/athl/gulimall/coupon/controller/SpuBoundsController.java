package com.athl.gulimall.coupon.controller;

import com.athl.common.to.SpuBoundsTo;
import com.athl.common.utils.PageUtils;
import com.athl.common.utils.R;
import com.athl.gulimall.coupon.entity.SpuBoundsEntity;
import com.athl.gulimall.coupon.service.SpuBoundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品spu积分设置
 *
 * @author huanglin
 * @email 2465652971@qq.com
 * @date 2020-07-16 15:15:16
 */
@RestController
@RequestMapping("coupon/spubounds")
public class SpuBoundsController {
    @Autowired
    private SpuBoundsService spuBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 可以使用save的本方法，因为@requestbody 无需使接受数据类型相同
     *
     * @param spuBoundsTo
     * @return
     */
    @PostMapping("/saveSpuBoundTo")
    public R saveSpuBounds(@RequestBody SpuBoundsTo spuBoundsTo) {
        spuBoundsService.saveSpuBounds(spuBoundsTo);
        return R.ok();
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SpuBoundsEntity spuBounds = spuBoundsService.getById(id);

        return R.ok().put("spuBounds", spuBounds);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuBoundsEntity spuBounds) {
        spuBoundsService.save(spuBounds);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuBoundsEntity spuBounds) {
        spuBoundsService.updateById(spuBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        spuBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
