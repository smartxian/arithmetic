package com.xianxian;

import java.util.ArrayList;

/**
 * ��Ŀ����
 ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * @author smartxian
 */
public class �������к�Ϊĳһֵ��·�� {

    ArrayList<ArrayList<Integer>> pathlist = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null){
            return pathlist;
        }
        list.add(root.val);
        target -= root.val;
        if((target == 0 && root.left == null) || (target == 0 && root.right == null)){
            pathlist.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);

        list.remove(list.size() - 1);

        return pathlist;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
