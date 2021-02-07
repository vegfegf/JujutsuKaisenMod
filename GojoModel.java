package com.Applhau.JujutsuKaisenMod.Armor.Model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class GojoModel extends ModelBiped 
{
	public GojoModel(float modelSize) 
	{
		super(modelSize);
		
		textureWidth = 64;
		textureHeight = 64;

		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, -24.0F, -2.0F, 8, 12, 4, 0.0F, false));
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 48, 4.0F, -24.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -8.0F, -24.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 16, 48, -4.0F, -12.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, 0.0F, -12.0F, -2.0F, 4, 12, 4, 0.0F, false));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -32.0F, -4.0F, 8, 8, 8, 0.0F, false));

	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) 
	{
		GlStateManager.pushMatrix();
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		if(entityIn.isSneaking())
		{
			GlStateManager.translate(0, 0.2, 0);
		}
		bipedBody.render(scale);
		bipedLeftArm.render(scale);
		bipedRightArm.render(scale);
		bipedRightLeg.render(scale);
		bipedLeftLeg.render(scale);
		bipedHead.render(scale);
		GlStateManager.popMatrix();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}